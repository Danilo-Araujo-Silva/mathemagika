package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             URLBuild
 *
 * Full name:        System`URLBuild
 *
 *                   URLBuild["path", {param   val , param   val , …}] builds a URL with the specified path and query parameters and values param  and val .
 *                                          1      1       2      2                                                                                i        i
 *                   URLBuild[{path , path , …}] builds a URL from the path components path .
 *                                 1      2                                                i
 *                   URLBuild[path, params] builds a URL from a specification of a path and query parameters.
 *                   URLBuild[assoc] builds a URL from an association of components.
 * Usage:            URLBuild[assoc, params] builds a URL from an association of components, plus query parameters and values.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/URLBuild
 * Documentation:    web: http://reference.wolfram.com/language/ref/URLBuild.html
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
 * Default value:    Options[URLBuild] := Options[URLQueryEncode]
 *
 * Numeric values:   None
 */
fun uRLBuild(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("URLBuild", arguments.toMutableList(), options)
}
