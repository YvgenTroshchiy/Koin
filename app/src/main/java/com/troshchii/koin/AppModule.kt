package com.troshchii.koin

import org.koin.dsl.module

val appModule = module {

    single<HelloRepository> { HelloRepositoryImpl() }

    factory { SimplePresenter(get()) }

}