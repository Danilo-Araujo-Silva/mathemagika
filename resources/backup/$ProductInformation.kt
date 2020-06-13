package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 *                   ProductIDName -> Mathematica
 *                   ProductKernelName -> Mathematica 12.1.0 Kernel
 *                   ProductVersion -> 12.1.0 for Mac OS X x86 (64-bit) (March 18, 2020)
 * Name:             ProductVersionNumber -> 12.1
 *
 *                   Information[ProductIDName -> Mathematica][FullName]
 *                   Information[ProductKernelName -> Mathematica 12.1.0 Kernel][FullName]
 *                   Information[ProductVersion -> 12.1.0 for Mac OS X x86 (64-bit) (March 18, 2020)][FullName]
 * Full name:        Information[ProductVersionNumber -> 12.1][FullName]
 *
 * Usage:            {Information[ProductIDName -> Mathematica][Usage], Information[ProductKernelName -> Mathematica 12.1.0 Kernel][Usage], Information[ProductVersion -> 12.1.0 for Mac OS X x86 (64-bit) (March 18, 2020)][Usage], Information[ProductVersionNumber -> 12.1][Usage]}
 *
 *                   Information[ProductIDName -> Mathematica][Options]
 *                   Information[ProductKernelName -> Mathematica 12.1.0 Kernel][Options]
 *                   Information[ProductVersion -> 12.1.0 for Mac OS X x86 (64-bit) (March 18, 2020)][Options]
 * Options:          Information[ProductVersionNumber -> 12.1][Options]
 *
 *                   Information[ProductIDName -> Mathematica][Attributes]
 *                   Information[ProductKernelName -> Mathematica 12.1.0 Kernel][Attributes]
 *                   Information[ProductVersion -> 12.1.0 for Mac OS X x86 (64-bit) (March 18, 2020)][Attributes]
 * Attributes:       Information[ProductVersionNumber -> 12.1][Attributes]
 *
 *                   local: <>{Information[ProductIDName -> Mathematica][Documentation], Information[ProductKernelName -> Mathematica 12.1.0 Kernel][Documentation], Information[ProductVersion -> 12.1.0 for Mac OS X x86 (64-bit) (March 18, 2020)][Documentation], Information[ProductVersionNumber -> 12.1][Documentation]}[Local]
 * Documentation:    web: <>{Information[ProductIDName -> Mathematica][Documentation], Information[ProductKernelName -> Mathematica 12.1.0 Kernel][Documentation], Information[ProductVersion -> 12.1.0 for Mac OS X x86 (64-bit) (March 18, 2020)][Documentation], Information[ProductVersionNumber -> 12.1][Documentation]}[Web]
 *
 *                   Information[ProductIDName -> Mathematica][Definitions]
 *                   Information[ProductKernelName -> Mathematica 12.1.0 Kernel][Definitions]
 *                   Information[ProductVersion -> 12.1.0 for Mac OS X x86 (64-bit) (March 18, 2020)][Definitions]
 * Definitions:      Information[ProductVersionNumber -> 12.1][Definitions]
 *
 *                   Information[ProductIDName -> Mathematica][OwnValues]
 *                   Information[ProductKernelName -> Mathematica 12.1.0 Kernel][OwnValues]
 *                   Information[ProductVersion -> 12.1.0 for Mac OS X x86 (64-bit) (March 18, 2020)][OwnValues]
 * Own values:       Information[ProductVersionNumber -> 12.1][OwnValues]
 *
 *                   Information[ProductIDName -> Mathematica][DownValues]
 *                   Information[ProductKernelName -> Mathematica 12.1.0 Kernel][DownValues]
 *                   Information[ProductVersion -> 12.1.0 for Mac OS X x86 (64-bit) (March 18, 2020)][DownValues]
 * Down values:      Information[ProductVersionNumber -> 12.1][DownValues]
 *
 *                   Information[ProductIDName -> Mathematica][UpValues]
 *                   Information[ProductKernelName -> Mathematica 12.1.0 Kernel][UpValues]
 *                   Information[ProductVersion -> 12.1.0 for Mac OS X x86 (64-bit) (March 18, 2020)][UpValues]
 * Up values:        Information[ProductVersionNumber -> 12.1][UpValues]
 *
 *                   Information[ProductIDName -> Mathematica][SubValues]
 *                   Information[ProductKernelName -> Mathematica 12.1.0 Kernel][SubValues]
 *                   Information[ProductVersion -> 12.1.0 for Mac OS X x86 (64-bit) (March 18, 2020)][SubValues]
 * Sub values:       Information[ProductVersionNumber -> 12.1][SubValues]
 *
 *                   Information[ProductIDName -> Mathematica][DefaultValues]
 *                   Information[ProductKernelName -> Mathematica 12.1.0 Kernel][DefaultValues]
 *                   Information[ProductVersion -> 12.1.0 for Mac OS X x86 (64-bit) (March 18, 2020)][DefaultValues]
 * Default value:    Information[ProductVersionNumber -> 12.1][DefaultValues]
 *
 *                   Information[ProductIDName -> Mathematica][NValues]
 *                   Information[ProductKernelName -> Mathematica 12.1.0 Kernel][NValues]
 *                   Information[ProductVersion -> 12.1.0 for Mac OS X x86 (64-bit) (March 18, 2020)][NValues]
 * Numeric values:   Information[ProductVersionNumber -> 12.1][NValues]
 */
fun `$ProductInformation`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("\$ProductInformation", arguments.toMutableList(), options)
}
