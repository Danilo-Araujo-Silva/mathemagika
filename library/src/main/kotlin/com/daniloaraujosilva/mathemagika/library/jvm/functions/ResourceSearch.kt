package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ResourceSearch
 *
 * Full name:        System`ResourceSearch
 *
 *                   ResourceSearch[form] gives a dataset of resources that contain text matching form.
 * Usage:            ResourceSearch[form, prop] returns the property prop of the search results.
 *
 *                   MaxItems -> Automatic
 *                   Method -> Automatic
 *                   ResourceSystemPath :> $ResourceSystemPath
 * Options:          ResourceSystemBase :> $ResourceSystemBase
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ResourceSearch
 * Documentation:    web: http://reference.wolfram.com/language/ref/ResourceSearch.html
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
fun resourceSearch(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ResourceSearch", arguments.toMutableList(), options)
}
