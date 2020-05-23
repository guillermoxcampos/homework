package com.spark.gcampos
import org.apache.spark._
import org.apache.spark.SparkContext
import org.apache.log4j

object homework {
  def main(args: Array[String]) {
   println("printing double with 2 decimal value and left padding integer")
  
   val x : Double = 42.354562;
   val y : Int = 3;
  
   println(f"$x%1.2f")
   println(f"$y%04d")
      }
}