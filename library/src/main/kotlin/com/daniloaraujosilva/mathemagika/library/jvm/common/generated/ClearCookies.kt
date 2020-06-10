package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ClearCookies
 * 
 * Full name:        System`ClearCookies
 * 
 *                   ClearCookies[domain] clears all persistent and session cookies associated with the specified domain.
 *                   ClearCookies[assoc] clears all cookies whose attributes match the specification in the association assoc.
 * Usage:            ClearCookies[All] clears all persistent and session cookies for all domains.
 * 
 * Options:          None
 * 
 * Attributes:
 * 
 *                   local: paclet:ref/ClearCookies
 * Documentation:    web: http://reference.wolfram.com/language/ref/ClearCookies.html
 * 
 * Definitions:      ClearCookies[CURLLink`Cookies`Private`args__] := With[{CURLLink`Cookies`Private`res = CURLLink`Cookies`Private`implClearCookies[CURLLink`Cookies`Private`args]}, CURLLink`Cookies`Private`res /; CURLLink`Cookies`Private`res =!= $Failed]
 * 
 * Own values:       None
 * 
 * Down values:      ClearCookies[CURLLink`Cookies`Private`args__] := With[{CURLLink`Cookies`Private`res = CURLLink`Cookies`Private`implClearCookies[CURLLink`Cookies`Private`args]}, CURLLink`Cookies`Private`res /; CURLLink`Cookies`Private`res =!= $Failed]
 * 
 * Up values:        None
 * 
 * Sub values:       None
 * 
 * Default value:    None
 * 
 * Numeric values:   None
 */
fun clearCookies(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ClearCookies", arguments.toMutableList(), options)
}
