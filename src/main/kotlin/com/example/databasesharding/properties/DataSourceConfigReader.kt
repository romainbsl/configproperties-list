package com.example.configuration.properties

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.PropertySource
import org.springframework.context.annotation.PropertySources
import org.springframework.stereotype.Component

//@Component
@PropertySources(value = [
  (PropertySource("classpath:/dbconfig/datasource.properties")),
  (PropertySource("classpath:/dbconfig/datasource-override.properties", ignoreResourceNotFound = true))
])
@ConfigurationProperties("datasource")
class DataSourceConfigReader {
  @Value("test")
  lateinit var test: String

   var base: List<OracleDataSourceProperties> = mutableListOf()
   var override: List<OracleDataSourceProperties> =mutableListOf()

  override fun toString(): String {
    return "DataSourceConfigReader(test='$test', base=$base, override=$override)"
  }


}