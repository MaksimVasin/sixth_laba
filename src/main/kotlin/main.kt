fun main() {

    //////////////////////////////////////////////
    ////////////// shape collector //////////////
    //////////////////////////////////////////////

    val shapesCollector = ShapeCollector<Shape>()
    val shapeFactory = ShapeFactoryImpl()
    shapesCollector.add(shapeFactory.createSquare(10.0))
    shapesCollector.add(shapeFactory.createRectangle(10.0, 20.0))
    shapesCollector.add(shapeFactory.createTriangle(30.0, 40.0, 50.0))
    shapesCollector.addAll(
        listOf(
            shapeFactory.createSquare(1.0),
            shapeFactory.createRectangle(1.0, 2.0),
            shapeFactory.createTriangle(3.0, 4.0, 5.0)
        )
    )

    println("Get all shapes: ")
    println(shapesCollector.getAll())
    println("Get all square (by class): ")
    println(shapesCollector.getAllByClass(Square::class.java))


    println("\nSort by area asc: ")
    shapesCollector.getAllSorted(ShapeComparators.compareByArea).forEach {
        print("${it.calcArea()} - $it\n")
    }

    println("\nSort by area desc: ")
    shapesCollector.getAllSorted(ShapeComparators.compareByAreaDesc).forEach {
        print("${it.calcArea()} - $it\n")
    }

    println("\nSort by perimeter asc: ")
    shapesCollector.getAllSorted(ShapeComparators.compareByPerimeter).forEach {
        print("${it.calcPerimeter()} - $it\n")
    }

    println("\nSort by perimeter desc: ")
    shapesCollector.getAllSorted(ShapeComparators.compareByPerimeterDesc).forEach {
        print("${it.calcPerimeter()} - $it\n")
    }

    //////////////////////////////////////////////
    ////////////// circle collector //////////////
    //////////////////////////////////////////////

    val circleCollector = ShapeCollector<Circle>()
    circleCollector.add(shapeFactory.createCircle(20.0))
    circleCollector.add(shapeFactory.createCircle(30.0))
    circleCollector.addAll(
        listOf(
            shapeFactory.createCircle(10.0),
            shapeFactory.createCircle(40.0)
        )
    )

    println("\n\nGet all circles: ")
    println(circleCollector.getAll())

    println("\nSort by area asc: ")
    circleCollector.getAllSorted(ShapeComparators.compareByArea).forEach {
        print("${it.calcArea()} - $it\n")
    }

    println("\nSort by area desc: ")
    circleCollector.getAllSorted(ShapeComparators.compareByAreaDesc).forEach {
        print("${it.calcArea()} - $it\n")
    }

    println("\nSort by perimeter asc: ")
    circleCollector.getAllSorted(ShapeComparators.compareByPerimeter).forEach {
        print("${it.calcPerimeter()} - $it\n")
    }

    println("\nSort by perimeter desc: ")
    circleCollector.getAllSorted(ShapeComparators.compareByPerimeterDesc).forEach {
        print("${it.calcPerimeter()} - $it\n")
    }

    println("\nSort by radius asc: ")
    circleCollector.getAllSorted(ShapeComparators.compareByRadius).forEach {
        print("${it.calcPerimeter()} - $it\n")
    }

    println("\nSort by radius desc: ")
    circleCollector.getAllSorted(ShapeComparators.compareByRadiusDesc).forEach {
        print("${it.calcPerimeter()} - $it\n")
    }
}