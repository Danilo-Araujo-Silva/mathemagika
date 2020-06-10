package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             FractionBox
 * 
 * Full name:        System`FractionBox
 * 
 *                                                                                         x
 *                   FractionBox[x, y] is a low-level formatting construct that represents - in notebook expressions. 
 * Usage:                                                                                  y
 * 
 *                   FractionLine -> Automatic
 * Options:          MultilineFunction -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/FractionBox
 * Documentation:    web: http://reference.wolfram.com/language/ref/FractionBox.html
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
fun fractionBox(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FractionBox", arguments.toMutableList(), options)
}
