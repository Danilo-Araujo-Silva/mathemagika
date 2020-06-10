package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             CloudConnect
 * 
 * Full name:        System`CloudConnect
 * 
 *                   CloudConnect[userid, password] authenticates to the Wolfram Cloud using the specified cloud user ID and password.
 *                   CloudConnect[userid] shows a dialog to input the password.
 * Usage:            CloudConnect[] shows a dialog to input both the cloud user ID and the password.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/CloudConnect
 * Documentation:    web: http://reference.wolfram.com/language/ref/CloudConnect.html
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
 * Default value:    Options[CloudConnect] = CloudObject`Private`sortOptions[{CloudBase :> $CloudBase}]
 * 
 * Numeric values:   None
 */
fun cloudConnect(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CloudConnect", arguments.toMutableList(), options)
}
