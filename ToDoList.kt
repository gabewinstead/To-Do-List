fun main() {
    val taskList = mutableListOf<String>()
    var running = true

    while (running) {
        print("\n1) Add Task\n2) View Tasks\n3) Delete Task\n4) Exit\nChoose an option: ")
        val choice = readln().toIntOrNull()

        if (choice == 1) {
            print("Enter a task: ")
            taskList.add(readln())
            println("Current Tasks: $taskList")

            print("Do you want to add another task? (y/n): ")
            while (readln().lowercase() == "y") {
                print("Enter a task: ")
                taskList.add(readln())
                println("Current Tasks: $taskList")
                print("Do you want to add another task? (y/n): ")
            }
            println("Exiting task entry...")
        }
        else if (choice == 2) {
            println("Current Tasks: $taskList")

            print("Do you want to add another task? (y/n): ")
            while (readln().lowercase() == "y") {
                print("Enter a task: ")
                taskList.add(readln())
                println("Current Tasks: $taskList")
                print("Do you want to add another task? (y/n): ")
            }
            println("Exiting task entry...")
        }
        else if (choice == 3) {
            println("Which task do you want to delete?: $taskList")
            val indexToRemove = readln().toIntOrNull()

            if (indexToRemove != null) {
                taskList.removeAt(indexToRemove - 1)
                println("Task Removed, current task list: $taskList")
            }
        }
        else if (choice == 4) {
            println("Exiting the program...")
            running = false
        }
        else {
            println("Invalid choice. Please enter a number from 1 to 4.")
        }
    }
}