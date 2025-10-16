// Task 8.3: weather station temperature analysis program


fun main() 
{
    // Add code here to:
    //   - Fetch data
    var dataset = fetchData()

    //   - Find records with lowest and highest temperatures
    // Lowest 
    var lowest = dataset[0]
    for (find in dataset)
    {
        if (find.second > lowest.second)
        {
            lowest = find
        }
    }
    //or
    var highest = dataset.maxBy { it.second } 

    //   - Compute average temperature
    var avg = averageTemp(dataset)

    //   - Display all of these statistics 
    
     
}
