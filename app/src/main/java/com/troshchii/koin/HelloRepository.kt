package com.troshchii.koin

interface HelloRepository {
    fun giveHello(): String
}

class HelloRepositoryImpl : HelloRepository {
    override fun giveHello() = "Hey! How are you?"
}

class Presenter(private val repo: HelloRepository) {
    fun sayHello() = "${repo.giveHello()}\nrepo: ${repo.hashCode()},\npresenter: ${this.hashCode()}"
}
