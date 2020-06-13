package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ObservableDecomposition
 *
 * Full name:        System`ObservableDecomposition
 *
 *                   ObservableDecomposition[sys] yields the observable subsystem of the system sys.
 *                   ObservableDecomposition[sys, {z , …}] specifies the new coordinates z .
 * Usage:                                           1                                     i
 *
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ObservableDecomposition
 * Documentation:    web: http://reference.wolfram.com/language/ref/ObservableDecomposition.html
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
fun observableDecomposition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ObservableDecomposition", arguments.toMutableList(), options)
}
