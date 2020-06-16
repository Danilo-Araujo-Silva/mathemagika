package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FindCookies
 *
 * Full name:        System`FindCookies
 *
 *                   FindCookies[] gives a list of all currently set cookies.
 *                   FindCookies[domain] gives a list of cookies associated with the specified domain.
 * Usage:            FindCookies[assoc] gives a list of cookies whose attributes match the specification in the association assoc.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/FindCookies
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindCookies.html
 *
 *                   FindCookies[] := $Cookies
 * Definitions:      FindCookies[CURLLink`Cookies`Private`parameters__] := CURLLink`Cookies`Private`implFindCookies[CURLLink`Cookies`Private`parameters]
 *
 * Own values:       None
 *
 *                   FindCookies[] := $Cookies
 * Down values:      FindCookies[CURLLink`Cookies`Private`parameters__] := CURLLink`Cookies`Private`implFindCookies[CURLLink`Cookies`Private`parameters]
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun findCookies(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindCookies", arguments.toMutableList(), options)
}
