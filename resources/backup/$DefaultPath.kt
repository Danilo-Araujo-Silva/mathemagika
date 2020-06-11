package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 *                   .
 *                   ~
 *                   /Applications/Mathematica.app/Contents/MacOS/Packages
 *                   /Applications/Mathematica.app/Contents/MacOS/SystemFiles/KernelInit
 * Name:             /Applications/Mathematica.app/Contents/MacOS/SystemFiles/GraphicsInit
 *
 *                   System`Dot
 *                   Missing[UnknownSymbol, ~][FullName]
 *                   Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS/Packages][FullName]
 *                   Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS/SystemFiles/KernelInit][FullName]
 * Full name:        Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS/SystemFiles/GraphicsInit][FullName]
 *
 * Usage:            {a . b . c or Dot[a, b, c] gives products of vectors, matrices, and tensors. , Missing[UnknownSymbol, ~][Usage], Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS/Packages][Usage], Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS/SystemFiles/KernelInit][Usage], Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS/SystemFiles/GraphicsInit][Usage]}
 *
 *                   None
 *                   Missing[UnknownSymbol, ~][Options]
 *                   Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS/Packages][Options]
 *                   Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS/SystemFiles/KernelInit][Options]
 * Options:          Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS/SystemFiles/GraphicsInit][Options]
 *
 *                   Flat OneIdentity Protected ReadProtected
 *                   Missing[UnknownSymbol, ~][Attributes]
 *                   Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS/Packages][Attributes]
 *                   Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS/SystemFiles/KernelInit][Attributes]
 * Attributes:       Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS/SystemFiles/GraphicsInit][Attributes]
 *
 *                   local: <>{<|Local -> paclet:ref/Dot, Web -> http://reference.wolfram.com/language/ref/Dot.html|>, Missing[UnknownSymbol, ~][Documentation], Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS/Packages][Documentation], Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS/SystemFiles/KernelInit][Documentation], Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS/SystemFiles/GraphicsInit][Documentation]}[Local]
 * Documentation:    web: <>{<|Local -> paclet:ref/Dot, Web -> http://reference.wolfram.com/language/ref/Dot.html|>, Missing[UnknownSymbol, ~][Documentation], Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS/Packages][Documentation], Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS/SystemFiles/KernelInit][Documentation], Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS/SystemFiles/GraphicsInit][Documentation]}[Web]
 *
 *                   None
 *                   Missing[UnknownSymbol, ~][Definitions]
 *                   Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS/Packages][Definitions]
 *                   Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS/SystemFiles/KernelInit][Definitions]
 * Definitions:      Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS/SystemFiles/GraphicsInit][Definitions]
 *
 *                   None
 *                   Missing[UnknownSymbol, ~][OwnValues]
 *                   Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS/Packages][OwnValues]
 *                   Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS/SystemFiles/KernelInit][OwnValues]
 * Own values:       Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS/SystemFiles/GraphicsInit][OwnValues]
 *
 *                   None
 *                   Missing[UnknownSymbol, ~][DownValues]
 *                   Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS/Packages][DownValues]
 *                   Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS/SystemFiles/KernelInit][DownValues]
 * Down values:      Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS/SystemFiles/GraphicsInit][DownValues]
 *
 *                   None
 *                   Missing[UnknownSymbol, ~][UpValues]
 *                   Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS/Packages][UpValues]
 *                   Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS/SystemFiles/KernelInit][UpValues]
 * Up values:        Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS/SystemFiles/GraphicsInit][UpValues]
 *
 *                   None
 *                   Missing[UnknownSymbol, ~][SubValues]
 *                   Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS/Packages][SubValues]
 *                   Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS/SystemFiles/KernelInit][SubValues]
 * Sub values:       Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS/SystemFiles/GraphicsInit][SubValues]
 *
 *                   None
 *                   Missing[UnknownSymbol, ~][DefaultValues]
 *                   Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS/Packages][DefaultValues]
 *                   Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS/SystemFiles/KernelInit][DefaultValues]
 * Default value:    Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS/SystemFiles/GraphicsInit][DefaultValues]
 *
 *                   None
 *                   Missing[UnknownSymbol, ~][NValues]
 *                   Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS/Packages][NValues]
 *                   Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS/SystemFiles/KernelInit][NValues]
 * Numeric values:   Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS/SystemFiles/GraphicsInit][NValues]
 */
fun `$DefaultPath`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("\$DefaultPath", arguments.toMutableList(), options)
}
