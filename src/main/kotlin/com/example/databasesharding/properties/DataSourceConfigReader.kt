package com.example.configuration.properties

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.PropertySource
import org.springframework.context.annotation.PropertySources

//@Component
@PropertySources(value = [
  (PropertySource("classpath:/dbconfig/datasource.properties")),
  (PropertySource("classpath:/dbconfig/datasource-override.properties", ignoreResourceNotFound = true))
])
@ConfigurationProperties("datasource")
class DataSourceConfigReader {
   var base: List<OracleDataSourceProperties> = mutableListOf()
   var override: List<OracleDataSourceProperties> =mutableListOf()

  override fun toString(): String {
    return "DataSourceConfigReader(base=$base, override=$override)"
  }
}