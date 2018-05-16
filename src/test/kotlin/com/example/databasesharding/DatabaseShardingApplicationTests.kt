package com.example.databasesharding

import com.example.configuration.properties.DataSourceConfigReader
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class DatabaseShardingApplicationTests {

  @Autowired
  lateinit var dataSourceConfigReader: DataSourceConfigReader

  @Test
  fun contextLoads() {
  }
  @Test
  fun printConfigReader() {
    println(dataSourceConfigReader)
  }

}
