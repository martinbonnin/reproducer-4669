package com.example.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.servicea.Feature1ServiceAQuery
import com.example.servicea.Feature2ServiceAQuery
import com.example.servicea.SchemaModuleServiceAQuery
import com.example.serviceb.Feature1ServiceBQuery
import com.example.serviceb.Feature2ServiceBQuery
import com.example.serviceb.SchemaModuleServiceBQuery


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Defined in :graphqlSchema / service-a
        SchemaModuleServiceAQuery()

        // Defined in :feature1 / service-a
        Feature1ServiceAQuery()

        // Defined in :feature2 / service-a
        Feature2ServiceAQuery()


        // Defined in :graphqlSchema / service-b
        SchemaModuleServiceBQuery()

        // Defined in :feature1 / service-b
        Feature1ServiceBQuery()

        // Defined in :feature2 / service-b
        Feature2ServiceBQuery()
    }
}
