package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             InverseTransformedRegion
 *
 * Full name:        System`InverseTransformedRegion
 *
 *                                                                                                       n
 * Usage:            InverseTransformedRegion[reg, f, n] represents the inverse transformed region {p ∈   | f(p) ∈ reg}, where reg is a region and f is a function.
 *
 *                   AlignmentPoint -> Center
 *                   AnnotationRules -> {}
 *                   AspectRatio -> Automatic
 *                   AutomaticImageSize -> False
 *                   Axes -> False
 *                   AxesEdge -> Automatic
 *                   AxesLabel -> None
 *                   AxesOrigin -> Automatic
 *                   AxesStyle -> {}
 *                   Background -> None
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   Boxed -> False
 *                   BoxRatios -> Automatic
 *                   BoxStyle -> {}
 *                   ControllerLinking -> False
 *                   ControllerMethod -> Automatic
 *                   ControllerPath -> Automatic
 *                   DisplayFunction :> $DisplayFunction
 *                   Epilog -> {}
 *                   FaceGrids -> None
 *                   FaceGridsStyle -> {}
 *                   Frame -> False
 *                   FrameLabel -> None
 *                   FrameStyle -> {}
 *                   FrameTicks -> None
 *                   FrameTicksStyle -> {}
 *                   GridLines -> None
 *                   GridLinesStyle -> {}
 *                   ImageMargins -> 0.
 *                   ImagePadding -> All
 *                   ImageSize -> Automatic
 *                   LabelStyle -> {}
 *                   Lighting -> Automatic
 *                   MeshCellHighlight -> {}
 *                   MeshCellLabel -> Automatic
 *                   MeshCellMarker -> 0
 *                   MeshCellShapeFunction -> Automatic
 *                   MeshCellStyle -> Automatic
 *                   PerformanceGoal :> $PerformanceGoal
 *                   PlotLabel -> None
 *                   PlotRange -> All
 *                   PlotRangeClipping -> False
 *                   PlotRangePadding -> Automatic
 *                   PlotRegion -> Automatic
 *                   PlotTheme -> Automatic
 *                   Prolog -> {}
 *                   Properties -> {}
 *                   RegionSize -> Automatic
 *                   RotateLabel -> True
 *                   RotationAction -> Fit
 *                   SphericalRegion -> Automatic
 *                   Ticks -> Automatic
 *                   TicksStyle -> {}
 *                   TouchscreenAutoZoom -> Automatic
 *                   ViewAngle -> Automatic
 *                   ViewCenter -> Automatic
 *                   ViewMatrix -> Automatic
 *                   ViewPoint -> {1.3, -2.4, 2.}
 *                   ViewProjection -> Automatic
 *                   ViewRange -> All
 *                   ViewVector -> Automatic
 * Options:          ViewVertical -> {0, 0, 1}
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/InverseTransformedRegion
 * Documentation:    web: http://reference.wolfram.com/language/ref/InverseTransformedRegion.html
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
fun inverseTransformedRegion(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InverseTransformedRegion", arguments.toMutableList(), options)
}
