// Task 8.3: weather station temperature analysis program

fun main() 
{
    // Add code here to:
    //   - Fetch data
    val dataset = fetchData()

    //   - Find records with lowest and highest temperatures
    // Lowest 
    var lowest = dataset[0]
    for (find in dataset)
    {
        if (find.second > dataset.second)
        {
            lowest = find
        }
    }
    //or
    var lowest2 = dataset.minBy{it.second} 

    //   - Compute average temperature
    var avg = averageTemp()
    //   - Display all of these statistics
}
