package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**                                                                        \!RowBox[{"LocalObject", "[",                                                                                                     represents a local object with a given file path.
 *````                                                                      *                   StyleBox[RowBox[{RowBox[{"\"file", ":", "//", "/", StyleBox["…", "TR"],"\""}]}], AutoSpacing -> False], "]"}] *                   LocalObject["relpath"] represents a local object with the given relative path.
 *                                                                                                                                                                                                             * Usage:            LocalObject["relpath", "lbase"] represents a local object relative to the base lbase.
 * Name:             LocalObject                                                                                                                                                                               * 
 *                                                                                                                                                                                                             * Options:          None
 * Full name:        System`LocalObject                                                                                                                                                                        * 
 *                                                                                                                                                                                                             *                   Protected
 *                   LocalObject[] represents a new anonymous local object.                                                                                                                                    * Attributes:       ReadProtected
 *                                                                                                                                                                                                             * 
                                                                                                                                                                                                               *                   local: paclet:ref/LocalObject
                                                                                                                                                                                                               * Documentation:    web: http://reference.wolfram.com/language/ref/LocalObject.html
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
                                                                                                                                                                                                               * Default value:    SyntaxInformation[LocalObject] = {"ArgumentsPattern" -> {_., _.}}
                                                                                                                                                                                                               * 
                                                                                                                                                                                                               * Numeric values:   None
                                                                                                                                                                                                               */
fun localObject(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LocalObject", arguments.toMutableList(), options)
}
