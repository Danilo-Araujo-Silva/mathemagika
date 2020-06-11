package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**                                                                               \!                                       ".
 *````                                                                             *                   StyleBox["url", "TI"] * Usage:            URLShorten[CloudObject[…]] creates a shortened URL that redirects to the URL for the specified cloud object.
 *                                                                                                                            *
 * Name:             URLShorten                                                                                               * Options:          None
 *                                                                                                                            *
 * Full name:        System`URLShorten                                                                                        *                   Protected
 *                                                                                                                            * Attributes:       ReadProtected
 *                   URLShorten["url"] creates a shortened URL that redirects to "                                            *
                                                                                                                              *                   local: paclet:ref/URLShorten
                                                                                                                              * Documentation:    web: http://reference.wolfram.com/language/ref/URLShorten.html
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
fun uRLShorten(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("URLShorten", arguments.toMutableList(), options)
}
