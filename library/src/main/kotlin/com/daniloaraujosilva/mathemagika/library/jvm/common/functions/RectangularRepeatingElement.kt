package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RectangularRepeatingElement
 *
 * Full name:        System`RectangularRepeatingElement
 *
 *                   RectangularRepeatingElement[elem] represents a rectangular array of elements of type spec in an interpreter, API or form specification.
 *                   RectangularRepeatingElement[elem, {maxrows, maxcolumns}] represents a rectangular array of elements of maximum size maxrows × maxcolums.
 * Usage:            RectangularRepeatingElement[elem, {{minrows, maxrows}, {mincolumns, maxcolumns}}] represents a rectangular array of elements of dimensions between minrows × mincolumns and maxrows × maxcolums.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/RectangularRepeatingElement
 * Documentation:    web: http://reference.wolfram.com/language/ref/RectangularRepeatingElement.html
 *
 * Definitions:      None
 *
 * Own values:       None
 *
 * Down values:      None
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun rectangularRepeatingElement(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RectangularRepeatingElement", arguments.toMutableList(), options)
}
