package com.bytedance.android.lesson.restapi.solution.newtork;

import com.bytedance.android.lesson.restapi.solution.bean.FeedResponse;
import com.bytedance.android.lesson.restapi.solution.bean.PostVideoResponse;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

/**
 * @author Xavier.S
 * @date 2019.01.17 20:38
 */
public interface IMiniDouyinService {
    // TODO-C2 (7) Implement your MiniDouyin PostVideo Request here, url: (POST) http://10.108.10.39:8080/minidouyin/video
    // TODO-C2 (8) Implement your MiniDouyin Feed Request here, url: http://10.108.10.39:8080/minidouyin/feed

    @Multipart
    @POST("")
    Call <PostVideoResponse > creatVideo(
            @Query("param_name1") String param1,
            @Query("param_name2") String param2,
            @Part MultipartBody.Part file1,@Part MultipartBody.Part file2);

}
