package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             WebAudioSearch
 * 
 * Full name:        System`WebAudioSearch
 * 
 *                   WebAudioSearch["string"] gives a dataset of the top web audio search results for the specified literal string.
 *                   WebAudioSearch[query] performs a web audio search using the specified query.
 *                   WebAudioSearch[query, format] gives the elements of the web audio search specified by format.
 * Usage:            WebAudioSearch[query, format, crit] returns only audio results that satisfy crit.
 * 
 * Options:          MaxItems -> 10
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/WebAudioSearch
 * Documentation:    web: http://reference.wolfram.com/language/ref/WebAudioSearch.html
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
fun webAudioSearch(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WebAudioSearch", arguments.toMutableList(), options)
}
