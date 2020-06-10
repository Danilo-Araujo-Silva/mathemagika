package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SqrtBox
 * 
 * Full name:        System`SqrtBox
 * 
 * Usage:            SqrtBox[x] is a low-level box construct that represents the displayed object Sqrt[x] in notebook expressions. 
 * 
 *                   MinSize -> Automatic
 * Options:          MultilineFunction -> None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/SqrtBox
 * Documentation:    web: http://reference.wolfram.com/language/ref/SqrtBox.html
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
fun sqrtBox(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SqrtBox", arguments.toMutableList(), options)
}
