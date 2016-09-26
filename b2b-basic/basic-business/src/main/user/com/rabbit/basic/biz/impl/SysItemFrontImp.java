package com.rabbit.basic.biz.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.basic.business.Pages;
import org.basic.business.SpringBeanUtils;
import org.fan.baseBusiness.util.Constant;
import org.fan.baseBusiness.util.DBInfoUtil;
import org.fan.baseBusiness.util.DbCol;
import org.fan.baseBusiness.util.DbTab;
import org.fan.baseBusiness.util.GlobalEnum.ELadder;
import org.fan.baseBusiness.util.StringUtil;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.bean.GlobalSelect;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.rabbit.basic.biz.ISysItemFront;
import com.rabbit.dao.SysItemMapper;
import com.rabbit.fanbase.io.requset.SysItemReq;
import com.rabbit.fanbase.io.requset.SysModelReq;
import com.rabbit.fanbase.io.response.SysItemRes;
import com.rabbit.model.SysItem;
import com.rabbit.model.SysItemExample;
import com.rabbit.service.ISysItemService;

@Service
public class SysItemFrontImp implements ISysItemFront {

	public final Logger log = Logger.getLogger(this.getClass());
	@Resource
	ISysItemService sysItemService;
	@Resource
	SysItemMapper sysItemMapper;

	@Override
	public Pages<?> browser(SysItemReq sysItem, int offset, int length) {
		SysItemExample example = new SysItemExample();
		/** 查询业务逻辑 **/
		SysItemExample.Criteria cri = example.createCriteria();
		cri.andLadderEqualTo((short) (sysItem.getLadder() + 1));
		cri.andParentIdEqualTo(sysItem.getParentId());
		/** 查询业务逻辑完 **/
		/** _____________________我是分隔线________________________________ **/
		PageHelper.startPage(offset, length);
		List<SysItem> list = sysItemService.selectByExample(example);
		PageInfo<SysItem> page = new PageInfo<SysItem>(list);
		return new Pages<SysItem>(page.getList(), page.getTotal(), offset, length);
	}

	@Override
	public int delete(List<SysItemReq> list) {
		log.info("devlopping");
		return 0;
	}

	@Override
	public long doAppend(SysItemReq sysItemReq) {
		SysItem sysItem = new SysItem();
		SpringBeanUtils.copyProperties(sysItemReq, sysItem);
		/** 新增业务逻辑 **/
		// sysItem.setAppendBy(appendBy)
		sysItem.setLadder(sysItem.getLadder() + 1);
		sysItem.setAppendTime(new Date());
		/** 新增业务逻辑完 **/
		/** _____________________我是分隔线________________________________ **/
		return sysItemService.insert(sysItem);
	}

	@Override
	public int update(SysItemReq sysItemReq) {
		SysItem sysItem = new SysItem();
		SpringBeanUtils.copyProperties(sysItemReq, sysItem);
		SysItemExample e = new SysItemExample();
		e.createCriteria().andIdEqualTo(sysItem.getId()).andParentIdEqualTo(sysItem.getParentId());

		return sysItemService.updateByExampleSelective(sysItem, e);
	}

	@Override
	public SysItemRes selectBy(SysItemReq sysItemReq) {
		SysItemExample e = new SysItemExample();
		e.createCriteria().andIdEqualTo(sysItemReq.getId()).andParentIdEqualTo(sysItemReq.getParentId());
		List<SysItem> list = sysItemService.selectByExample(e);
		SysItemRes res = new SysItemRes();
		if (list.size() != 1) {
			SpringBeanUtils.copyProperties(list.get(0), res);
		}
		return res;
	}

	/**
	 * 生成文件时,初如化选项
	 */
	@Override
	public void init(List<DbCol> cols, SysModelReq sysItemReq, DbTab dbTab) {

		// 表对应的模块名存在否
		SysItem sysItem = insertByModelLevel(sysItemReq);
		// 模块下面的表存在否
		sysItem = insertByTableLevel(sysItem, cols.get(0).getTbName(), dbTab.getComments());
		for (DbCol dbCol : cols) {
			/*
			 * String colComments = dbCol.getComments();
			 * System.out.println(dbCol.isSelect()+":"+colComments);
			 */
			if (dbCol.isSelect()) {
				initSysItem(dbCol, sysItem.getId());
			}
		}

	}

	private SysItem insertByTableLevel(SysItem sysItem, String tbName, String tbComments) {
		tbName = DBInfoUtil.dbColumn2JavaBeanName(new StringBuilder(tbName));

		SysItemExample e = new SysItemExample();
		com.rabbit.model.SysItemExample.Criteria c = e.createCriteria();
		c.andItemCodeEqualTo(tbName);
		c.andParentIdEqualTo(sysItem.getId());
		c.andLadderEqualTo(SysItemReq.LADDER.TABLE_LEVEL);

		List<SysItem> list = sysItemService.selectByExample(e);
		SysItem sysOpt = list.isEmpty() ? null : list.get(0);
		if (list.isEmpty()) {
			sysOpt = new SysItem();
			sysOpt.setParentId(sysItem.getId());
			sysOpt.setItemCode(tbName);
			sysOpt.setItemComments(tbComments);
			sysOpt.setLadder(SysItemReq.LADDER.TABLE_LEVEL);
			sysOpt.setStatus(SysItemReq.STATUS.ENABLED);
			sysOpt.setAppendTime(new Date());
			sysOpt.setAppendBy(0L);
			sysOpt.setRemark(tbName);
			// 排序
			e.clear();
			e.createCriteria().andParentIdEqualTo(sysItem.getId()).andLadderEqualTo(SysItemReq.LADDER.TABLE_LEVEL);
			sysOpt.setSort((Short.valueOf(sysItemService.countByExample(e) + "")));

			sysItemService.insert(sysOpt);
		} else {

			sysOpt.setItemComments(tbComments);
			sysItemService.updateByPrimaryKey(sysOpt);
		}
		return sysOpt;
	}

	private SysItem insertByModelLevel(SysModelReq sysItemReq) {
		SysItemExample e = new SysItemExample();
		com.rabbit.model.SysItemExample.Criteria c = e.createCriteria();
		c.andKeyCodeEqualTo(sysItemReq.getModelCode());
		c.andParentIdEqualTo(0L);
		c.andLadderEqualTo(SysItemReq.LADDER.MODEL_LEVEL);
		List<SysItem> list = sysItemService.selectByExample(e);
		SysItem sysOpt = list.isEmpty() ? null : list.get(0);
		if (list.isEmpty()) {
			sysOpt = new SysItem();
			sysOpt.setParentId(0L);
			sysOpt.setItemCode(sysItemReq.getKeyword());
			sysOpt.setItemComments(sysItemReq.getName());
			sysOpt.setKeyCode(sysItemReq.getModelCode());
			sysOpt.setLadder(SysItemReq.LADDER.MODEL_LEVEL);
			sysOpt.setStatus(SysItemReq.STATUS.ENABLED);
			sysOpt.setAppendTime(new Date());
			// 排序
			e.clear();
			e.createCriteria().andParentIdEqualTo(0L).andLadderEqualTo(SysItemReq.LADDER.MODEL_LEVEL);
			sysOpt.setSort((Short.valueOf(sysItemService.countByExample(e) + "")));
			sysItemService.insert(sysOpt);
		}
		return sysOpt;

	}

	private void initSysItem(DbCol cols, long parentId) {
		SysItem sysOpt = null;
		String[] colComments = cols.getComments().split("@");
		if (colComments.length == 1) {
			return;
		}
		String[] Items = colComments[1].split("\\|");
		if (Items.length == 1) {
			return;
		}
		short i = 0;
		boolean isQeruySort = true;
		String keyCode;
		String keyVal;
		for (String opt : Items) {
			String[] valKey = opt.split(":");
			if (StringUtil.isContainChinese(valKey[1])) {
				keyCode = valKey[0];
				keyVal = valKey[1];
			} else {
				keyCode = valKey[1];
				keyVal = valKey[0];
			}

			String colName = DBInfoUtil.dbName2JavaBeanName(new StringBuilder(cols.getColName()));
			SysItemExample e = new SysItemExample();
			com.rabbit.model.SysItemExample.Criteria c = e.createCriteria();

			c.andItemCodeEqualTo(colName);
			c.andParentIdEqualTo(parentId);
			c.andLadderEqualTo(SysItemReq.LADDER.COLUMN_LEVEL);
			c.andKeyCodeEqualTo(keyCode);
			// sysOpt = (SysItem) sysItemMapper.selectByExample(e);

			if (sysItemService.countByExample(e) == 0) {
				sysOpt = new SysItem();
				sysOpt.setParentId(parentId);
				sysOpt.setItemCode(colName);
				sysOpt.setRemark(cols.getColName());
				sysOpt.setItemComments(colComments[0]);
				sysOpt.setLadder(SysItemReq.LADDER.COLUMN_LEVEL);
				sysOpt.setStatus(SysItemReq.STATUS.ENABLED);
				sysOpt.setAppendTime(new Date());
				sysOpt.setKeyCode(keyCode);
				sysOpt.setKeyValue(keyVal);
				// 排序
				if (isQeruySort) {
					e.clear();
					e.createCriteria().andParentIdEqualTo(parentId).andLadderEqualTo(SysItemReq.LADDER.TABLE_LEVEL);
					i = (Short.valueOf(sysItemService.countByExample(e) + ""));
					isQeruySort = false;
				}
				sysOpt.setSort(i++);
				sysItemService.insert(sysOpt);
			}
		}
	}

	@Override
	public List<?> getTreeByLadder(short ladder) {
		return sysItemService.getTreeByLadder(ladder);
	}

	/**
	 * 系统先项表数居缓存
	 * 
	 * @return
	 * @throws JsonProcessingException 
	 * @throws IOException
	 * @throws JsonMappingException
	 * @throws JsonGenerationException
	 * @throws JSONException
	 */
	@Override
	public Map<String, Object> witteValueAsMap(SysItemReq s, ELadder ladder) throws JsonProcessingException {
		Map<String, Object> map = new HashMap<String, Object>();
		SysItemExample e = new SysItemExample();
		com.rabbit.model.SysItemExample.Criteria c = e.createCriteria();
		c.andLadderEqualTo(ladder.getLadder());

		List<SysItem> list = sysItemService.selectByExample(e);
		String key = "";
		for (SysItem sysItem : list) {

			if (sysItem.getLadder() != ELadder.TABLE_LEVEL.getLadder())
				continue;

			SysItem vo = new SysItem();
			vo.setParentId(sysItem.getId());
			vo.setLadder(ELadder.COLUMN_LEVEL.getLadder());

			List<?> simpleList = sysItemService.selectSimple(vo);

			if (simpleList.isEmpty())
				continue;

			String lastPcode = ((GlobalSelect) simpleList.get(0)).getPcode();
			int lastIndex = 0;
			int currIndex = 0;
			JSONObject json = new JSONObject();
			for (Object obj : simpleList) {
				GlobalSelect gSelset = (GlobalSelect) obj;
				if (!lastPcode.equals(gSelset.pcode)) {
					map.put(sysItem.getItemCode() + "." + lastPcode + ".RANGE", json.toString());
					json = new JSONObject();
					key = sysItem.getItemCode() + "." + lastPcode + ".JSON";
					map.put(key, Constant.objectMapper.writeValueAsString(simpleList.subList(lastIndex, currIndex)));
					lastIndex = currIndex;
				}
				key = sysItem.getItemCode() + "_" + gSelset.getPcode() + "_" + gSelset.getId().toUpperCase();
				json.put(key, gSelset.getText());

				lastPcode = gSelset.getPcode();
				currIndex++;
			}
			if (lastIndex == 0) {
				// map.put(sysItem.getItemCode()+"."+lastPcode+".RANGE" , json);
				key = sysItem.getItemCode() + "." + lastPcode + ".JSON";
				map.put(key, Constant.objectMapper.writeValueAsString(simpleList));
			} else {
				key = sysItem.getItemCode() + "." + lastPcode + ".JSON";
				map.put(key, Constant.objectMapper.writeValueAsString(simpleList.subList(lastIndex, currIndex)));
			}
			map.put(sysItem.getItemCode() + "." + lastPcode + ".RANGE", json.toString());

		}
		return map;
	}

	public List<HashMap<Object, Object>> selectByItemCode(String parm) {
		List<HashMap<Object, Object>> list = new ArrayList<HashMap<Object, Object>>();
		// 按照指定的ItemCode查询
		SysItemExample e = new SysItemExample();
		e.createCriteria().andItemCodeEqualTo(parm);
		List<SysItem> sysItemList = sysItemService.selectByExample(e);
		for (int i = 0; i < sysItemList.size(); i++) {
			HashMap<Object, Object> map = new HashMap<Object, Object>();
			map.put("keyValue", sysItemList.get(i).getKeyValue());
			map.put("keyCode", sysItemList.get(i).getKeyCode());
			list.add(map);
		}
		return list;
	}

	@Override
	public int delete(SysItemReq sysItem) {
		// sysItem.setStatus((short)1);
		// return sysItemService.updateByPrimaryKeySelective(new ());
		return 0;
	}

	@Override
	public List<?> selectSimple(SysItemReq sysItemReq) {
		SysItem sysItem = new SysItem();
		SpringBeanUtils.copyProperties(sysItemReq, sysItem);
		return sysItemService.selectSimple(sysItem);
	}

}
