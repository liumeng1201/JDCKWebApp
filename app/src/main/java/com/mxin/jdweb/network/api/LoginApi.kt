package com.mxin.jdweb.network.api

import com.mxin.jdweb.network.data.AuthTokenData
import com.mxin.jdweb.network.data.BaseResponse
import com.mxin.jdweb.network.data.LoginData
import okhttp3.RequestBody
import retrofit2.http.*

interface LoginApi {

    //登录
    @POST("api/user/login")
    suspend fun login(@Body body: RequestBody):BaseResponse<LoginData>

    //授权获取token
    @FormUrlEncoded
    @GET("open/auth/token")
    suspend fun authToken(@Query("client_id") client_id:String, @Query("client_secret") client_secret:String):BaseResponse<AuthTokenData>


}