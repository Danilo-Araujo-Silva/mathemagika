package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**                                                                                                               \!RowBox[{"CloudObject", "[",                                                                                                                represents a cloud object of a given user with a given path.                                                  \!RowBox[{"CloudObject", "[",                                                                                             represents a cloud object of the currently authenticated user at an absolute path.
 *````                                                                                                             *                   StyleBox[RowBox[{"\"user", ":", StyleBox["user", "TI"], "/", StyleBox["path", "TI"],"\""}], AutoSpacing -> False], "]"}] *                   CloudObject[uuid:StyleBox[uuid, TI]] represents a cloud object identified by a given UUID. *                   StyleBox[                                                                                              *                   CloudObject["relpath"] represents a cloud object of the currently authenticated user at a relative path.
 *                                                                                                                                                                                                                                                               *                                                                                                              *                   StyleBox[RowBox[{"\"/","abspath\""}], "TI", ShowStringCharacters->True], AutoSpacing -> False], "]"}] * Usage:            CloudObject["relpath", base] represents a cloud object with a path relative to the base path base.
 * Name:             CloudObject                                                                                                                                                                                                                                                                                                                                                                                                                                                                           *
 *                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         * Options:          None
 * Full name:        System`CloudObject                                                                                                                                                                                                                                                                                                                                                                                                                                                                    *
 *                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         *                   Protected
 *                   CloudObject[] represents a new anonymous cloud object.                                                                                                                                                                                                                                                                                                                                                                                                                                * Attributes:       ReadProtected
 *                   CloudObject["http://…"], CloudObject["https://…"] represents a cloud object with a given URI.                                                                                                                                                                                                                                                                                                                                                                                         *
 *                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         *                   local: paclet:ref/CloudObject
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           * Documentation:    web: http://reference.wolfram.com/language/ref/CloudObject.html
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
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           * Default value:    Options[CloudObject] = CloudObject`Private`objectFunctionOptionsJoin[{AppearanceElements -> All, CloudObjectNameFormat -> Automatic, CloudObjectURLType -> Automatic, IconRules -> Automatic, MetaInformation -> {}, Permissions -> Automatic}, {AutoCopy -> False, SharingList -> {}, SourceLink -> Automatic}]
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           *
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           * Numeric values:   None
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           */
fun cloudObject(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CloudObject", arguments.toMutableList(), options)
}
