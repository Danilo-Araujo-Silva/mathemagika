package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             TextSearch
 * 
 * Full name:        System`TextSearch
 * 
 *                   TextSearch[source, form] searches for files referenced by source that contain text matching form.
 * Usage:            TextSearch[source, form, "prop"] returns the property prop for each result.
 * 
 *                   ContentFieldOptions -> <||>
 *                   DocumentWeightingRules -> None
 * Options:          MaxItems -> All
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/TextSearch
 * Documentation:    web: http://reference.wolfram.com/language/ref/TextSearch.html
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
fun textSearch(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TextSearch", arguments.toMutableList(), options)
}
