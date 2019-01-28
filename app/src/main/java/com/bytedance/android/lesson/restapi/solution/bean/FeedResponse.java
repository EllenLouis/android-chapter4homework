package com.bytedance.android.lesson.restapi.solution.bean;

import retrofit2.http.Query;

/**
 * @author Xavier.S
 * @date 2019.01.20 14:17
 */
public class FeedResponse {

    // TODO-C2 (2) Implement your FeedResponse Bean here according to the response json
    @Query("feed")  private Feed feed[];

    public Feed[] getFeed() {
        return feed;
    }

    int i;
    public void setFeed(Feed[] feed) {
        for(i = 0; i < feed.length; ++i){
            this.feed[i] = feed[i];
        }
    }//这个并不是很确定是不是要全部输出，待定
}
