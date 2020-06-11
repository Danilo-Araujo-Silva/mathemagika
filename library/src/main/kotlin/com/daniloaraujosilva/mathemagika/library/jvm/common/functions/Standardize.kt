package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Standardize
 *
 * Full name:        System`Standardize
 *
 *                   Standardize[list] shifts and rescales the elements of list to have zero mean and unit sample variance.
 *                   Standardize[list, f ] shifts the elements in list by f [list] and rescales them to have unit sample variance.
 *                                      1                                  1
 *                   Standardize[list, f , f ] shifts by f [list] and scales by f [list].
 * Usage:                               1   2             1                      2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Standardize
 * Documentation:    web: http://reference.wolfram.com/language/ref/Standardize.html
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
fun standardize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Standardize", arguments.toMutableList(), options)
}
