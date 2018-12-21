package id.arieridwan.mvww.data.service

import id.arieridwan.mvww.data.entity.MovieListResponse
import id.arieridwan.mvww.data.entity.ReviewListResponse
import id.arieridwan.mvww.data.entity.TrailerListResponse
import io.reactivex.Observable
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * Created by arieridwan on 20/12/18.
 */

interface ApiService {

    @GET("movie/{category}")
    fun getMovies(@Path("category") category: String, @Query("api_key") apiKey: String,
                  @Query("page") page: Int): Single<MovieListResponse>

    @GET("movie/{id}/videos")
    fun getTrailer(@Query("api_key") apiKey: String, @Path("id") id: Int): Observable<TrailerListResponse>

    @GET("movie/{id}/reviews")
    fun getReviews(@Query("api_key") apiKey: String, @Path("id") id: Int): Observable<ReviewListResponse>

}