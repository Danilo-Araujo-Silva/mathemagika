package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             HornerForm
 *
 * Full name:        System`HornerForm
 *
 *                   HornerForm[poly] puts the polynomial poly in Horner form.
 *                   HornerForm[poly, vars] puts poly in Horner form with respect to the variable or variable list vars.
 *                   HornerForm[poly /poly ] puts the rational function poly /poly  in Horner form by nesting poly  and poly .
 *                                  1     2                                 1     2                               1         2
 *                   HornerForm[poly /poly , vars , vars ] puts poly /poly  in Horner form using the variables or variable lists vars  and vars  for poly  and poly , respectively.
 * Usage:                           1     2      1      2           1     2                                                          1         2         1         2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HornerForm
 * Documentation:    web: http://reference.wolfram.com/language/ref/HornerForm.html
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
fun hornerForm(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HornerForm", arguments.toMutableList(), options)
}
