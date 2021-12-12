class ShapeCollector<T : Shape> {
    private val allShapes = mutableListOf<T>()

    fun add(new: T) { // add shape
        allShapes.add(new)
    }

    fun addAll(new: List<T>) { // add shape list
        allShapes.addAll(new)
    }

    fun getAll(): List<T> = allShapes.toList() // get all shapes

    fun getAllSorted(comparator: Comparator<in T>): List<T> = allShapes.sortedWith(comparator) // get all shapes with sorted by parameter

    fun getAllByClass(classname: Class<out T>): List<T> = allShapes.filterIsInstance(classname) // get all shapes by class ( +1 point )
}

object ShapeComparators {
    val compareByArea = compareBy<Shape> { it.calcArea() } // sorted by area ascending
    val compareByAreaDesc = compareByDescending<Shape> { it.calcArea() } // sorted by area descending
    val compareByPerimeter = compareBy<Shape> { it.calcPerimeter() } // sorted by perimeter ascending
    val compareByPerimeterDesc = compareByDescending<Shape> { it.calcPerimeter() } // sorted by perimeter descending
    val compareByRadius = compareBy<Circle> { it.radius } // sorted by radius ascending
    val compareByRadiusDesc = compareByDescending<Circle> { it.radius } // sorted by radius descending
}
