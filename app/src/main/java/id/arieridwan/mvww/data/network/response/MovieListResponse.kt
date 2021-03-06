package id.arieridwan.mvww.data.network.response

import com.squareup.moshi.Json

data class MovieListResponse(val page: Long, @Json(name = "total_results") val totalResults: Long,
                             @Json(name = "total_pages") val totalPages: Long,
                             @Json(name = "results") val movies: List<MovieResponse>)