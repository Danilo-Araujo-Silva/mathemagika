package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**                                                                                                                                                                  \!                                            ".
 *````                                                                                                                                                                * Usage:            StyleBox["context`", "TI"] *
 *                                                                                                                                                                                                                    * Options:          None
 * Name:             GetContext                                                                                                                                                                                       *
 *                                                                                                                                                                                                                    * Attributes:       Protected
 * Full name:        System`GetContext                                                                                                                                                                                *
 *                                                                                                                                                                                                                    *                   local: <>None[Local]
 *                   GetContext["context`"] loads the file named by ContextToFileName["context`"], which gives the conventional filename for a package that defines "                                                 * Documentation:    web: <>None[Web]
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
fun getContext(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GetContext", arguments.toMutableList(), options)
}
