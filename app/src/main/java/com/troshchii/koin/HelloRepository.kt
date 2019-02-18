package com.troshchii.koin

interface HelloRepository {
    fun giveHello(): String
}

class HelloRepositoryImpl : HelloRepository {
    override fun giveHello() = "Hey! How are you?"
}

class SimplePresenter(private val repo: HelloRepository) {
    fun sayHello() = "${repo.giveHello()}\n" +
            "repo: ${repo.hashCode()},\n" +
            "presenter: ${this.hashCode()}"
}
