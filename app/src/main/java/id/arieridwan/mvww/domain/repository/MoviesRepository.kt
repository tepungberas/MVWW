package id.arieridwan.mvww.domain.repository

import id.arieridwan.mvww.presentation.model.MovieUiModel
import io.reactivex.Observable
import io.reactivex.Single

/**
 * Created by arieridwan on 20/12/18.
 */

interface MoviesRepository {

    fun loadMoviesFromNetwork(category: String, page: Int): Single<List<MovieUiModel>>
    fun loadMoviesFromDisk(category: String, page: Int): Observable<List<MovieUiModel>>

}