package com.okitoki.okchat.di

import com.okitoki.okchat.ui.viewmodel.SearchViewModel
import com.okitoki.okchat.ui.viewmodel.BookmarkViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * @author ridsync
 */
val viewModelModule = module {
    viewModel { SearchViewModel(get()) }
    viewModel { BookmarkViewModel(get()) }
}