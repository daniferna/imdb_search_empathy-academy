package com.searchpath.empathy.pojo.aggregations;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.searchpath.empathy.pojo.aggregations.serializers.BucketSerializer;

import java.util.StringJoiner;

@JsonSerialize(using = BucketSerializer.class)
public class DateHistogramBucket implements IBucket {

    private final String decade;
    private final long count;

    public DateHistogramBucket(long docCount, String key) {
        this.count = docCount;
        this.decade = key + "-" + (Integer.parseInt(key)+10);
    }

    @Override
    public String getName() {
        return decade;
    }

    public long getCount() {
        return count;
    }

    public String getDecade() {
        return decade;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", DateHistogramBucket.class.getSimpleName() + "[", "]")
                .add("docCount=" + count)
                .add("decade='" + decade + "'")
                .toString();
    }
}
