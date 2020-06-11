package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SetCookies
 *
 * Full name:        System`SetCookies
 *
 *                   SetCookies[assoc] sets cookies with attributes specified by the association assoc, to be used by functions such as URLExecute.
 *                   SetCookies[{assoc , assoc , …}] sets a list of cookies.
 * Usage:                             1       2
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/SetCookies
 * Documentation:    web: http://reference.wolfram.com/language/ref/SetCookies.html
 *
 * Definitions:      SetCookies[CURLLink`Cookies`Private`args__] := With[{CURLLink`Cookies`Private`res = CURLLink`Cookies`Private`implSetCookies[CURLLink`Cookies`Private`args]}, CURLLink`Cookies`Private`res /; CURLLink`Cookies`Private`res =!= $Failed]
 *
 * Own values:       None
 *
 * Down values:      SetCookies[CURLLink`Cookies`Private`args__] := With[{CURLLink`Cookies`Private`res = CURLLink`Cookies`Private`implSetCookies[CURLLink`Cookies`Private`args]}, CURLLink`Cookies`Private`res /; CURLLink`Cookies`Private`res =!= $Failed]
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun setCookies(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SetCookies", arguments.toMutableList(), options)
}
