package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DiceDissimilarity
 *
 * Full name:        System`DiceDissimilarity
 *
 * Usage:            DiceDissimilarity[x, y] gives the Dice dissimilarity between Boolean vectors x and y.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DiceDissimilarity
 * Documentation:    web: http://reference.wolfram.com/language/ref/DiceDissimilarity.html
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
fun diceDissimilarity(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DiceDissimilarity", arguments.toMutableList(), options)
}
