package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SubscriptBoxOptions
 *
 * Full name:        System`SubscriptBoxOptions
 *
 * Usage:            SubscriptBoxOptions is an option for selections that specifies settings for SubscriptBox objects.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SubscriptBoxOptions
 * Documentation:    web: http://reference.wolfram.com/language/ref/SubscriptBoxOptions.html
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
fun subscriptBoxOptions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SubscriptBoxOptions", arguments.toMutableList(), options)
}
