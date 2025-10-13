// Task 8.3: functions for temperature analysis 

typealias Record = Pair<String,Double>

fun fetchData(): List<Record> 
{
  var dataset = listOf<Record>(     
        "StationA" to 18.4,
        "StationB" to 21.9,
        "StationC" to 16.2,
        "StationD" to 23.7,
        "StationE" to 19.8) 
  // Create and return a simulated dataset here
  

  return dataset 
  // Use the listOf() and to() functions to create the dataset
}

// Challenge: compute average temperature with one line of code
// in main(), instead of using the function below!

fun averageTemp(data: List<Record>): Double {
    var sum = 0.0
    for (record in data) {
        sum += record.second
    }
    return sum / data.size
}
