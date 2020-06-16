package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ObservableModelQ
 *
 * Full name:        System`ObservableModelQ
 *
 *                   ObservableModelQ[sys] gives True if the system sys is observable, and False otherwise.
 * Usage:            ObservableModelQ[{sys, sub}] gives True if the subsystem sub is observable.
 *
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ObservableModelQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/ObservableModelQ.html
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
fun observableModelQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ObservableModelQ", arguments.toMutableList(), options)
}
