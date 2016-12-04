package com.logesh.feelers

import breeze.linalg._
import scala.collection.mutable._
import scala.util.Random
import scala.io.Source
import com.logesh.feelers.KMeans

object Kmeans_impl {

	 val dataset = ListBuffer[DenseVector[Double]]();
	 val bufferedSource = Source.fromFile("/Volumes/D/Design/garage/hacks/spark/feelers/kmeans/crime_data.csv");
	 var lines = bufferedSource.getLines;
	 lines.foreach(l=> dataset += DenseVector(l.split(",").slice(2,7).map(_.toDouble)));
	 val data = dataset.toList;

	 println(KMeans.train(4,100,data).run());
	
}