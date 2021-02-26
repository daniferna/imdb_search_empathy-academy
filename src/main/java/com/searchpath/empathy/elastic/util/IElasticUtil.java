package com.searchpath.empathy.elastic.util;

public interface IElasticUtil {

    /**
     * Connects with ElasticSearch and ask for the info of the ElasticSearch cluster. Then get the cluster name
     * @return Name of the ElasticSearch cluster
     */
    String getClusterName();

}