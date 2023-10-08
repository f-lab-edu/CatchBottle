//package com.season.winter.catchbottle.worker
//
//import android.content.Context
//import android.util.Log
//import androidx.startup.Initializer
//import androidx.work.Configuration
//import androidx.work.WorkManager
//import dagger.Module
//import dagger.Provides
//import dagger.hilt.InstallIn
//import dagger.hilt.android.qualifiers.ApplicationContext
//import dagger.hilt.components.SingletonComponent
//import javax.inject.Singleton
//
//
//// 테스트 코드 작성할 때 활용할 수 있는 worker 초기화
//@Module
//@InstallIn(SingletonComponent::class)
//object WorkManagerInitializer : Initializer<WorkManager> {
//
//    @Provides
//    @Singleton
//    override fun create(@ApplicationContext context: Context): WorkManager {
//        val configuration = Configuration.Builder().build()
//        WorkManager.initialize(context, configuration)
//        Log.e("Hilt Init", "WorkManager initialized by Hilt this time")
//        return WorkManager.getInstance(context)
//    }
//
//    override fun dependencies(): List<Class<out Initializer<*>>> {
//        // No dependencies on other libraries.
//        return emptyList()
//    }
//}