package com.troshchii.koin

import org.junit.After
import org.junit.Test
import org.koin.standalone.StandAloneContext.stopKoin
import org.koin.test.KoinTest
import org.koin.test.checkModules

class CheckModulesTest : KoinTest {

    @Test fun `check all modules`() {
        checkModules(listOf(appModule))
    }

    @After fun close() {
        stopKoin()
    }
}