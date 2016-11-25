package org.elastic.job;

/**
 * Hello world!
 *
 */
public class MyElasticJob  extends AbstractOneOffElasticJob {

    @Override
    protected void process(JobExecutionMultipleShardingContext context) {
        // do something by sharding items
    }
}