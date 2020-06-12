package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FileNameJoin
 *
 * Full name:        System`FileNameJoin
 *
 *                   FileNameJoin[{name , name , …}] joins the name  together into a file name suitable for your current operating system.
 *                                     1      2                    i
 *                   FileNameJoin[{CloudObject[…], name , …}] joins the name  to the path in the specified cloud object.
 *                                                     2                    i
 *                   FileNameJoin[{LocalObject[…], name , …}] joins the name  to the path in the specified local object.
 * Usage:                                              2                    i
 *
 * Options:          OperatingSystem -> MacOSX
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FileNameJoin
 * Documentation:    web: http://reference.wolfram.com/language/ref/FileNameJoin.html
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
fun fileNameJoin(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FileNameJoin", arguments.toMutableList(), options)
}
