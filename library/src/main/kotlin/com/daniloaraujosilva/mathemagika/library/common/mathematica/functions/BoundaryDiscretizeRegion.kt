package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             BoundaryDiscretizeRegion
 *
 * Full name:        System`BoundaryDiscretizeRegion
 *
 *                   BoundaryDiscretizeRegion[reg] discretizes the region reg into a BoundaryMeshRegion.
 *                   BoundaryDiscretizeRegion[reg, {{x   , x   }, …}] restricts to the bounds [x   , x   ] × ⋯.
 * Usage:                                             min   max                                 min   max
 *
 *                   AccuracyGoal -> Automatic
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
 *                   MaxCellMeasure -> Automatic
 *                   MeshCellHighlight -> {}
 *                   MeshCellLabel -> Automatic
 *                   MeshCellMarker -> 0
 *                   MeshCellShapeFunction -> Automatic
 *                   MeshCellStyle -> Automatic
 *                   Method -> Automatic
 *                   PerformanceGoal :> $PerformanceGoal
 *                   PlotLabel -> None
 *                   PlotRange -> All
 *                   PlotRangeClipping -> False
 *                   PlotRangePadding -> Automatic
 *                   PlotRegion -> Automatic
 *                   PlotTheme -> Automatic
 *                   PrecisionGoal -> Automatic
 *                   Prolog -> {}
 *                   Properties -> {}
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
 *                   local: paclet:ref/BoundaryDiscretizeRegion
 * Documentation:    web: http://reference.wolfram.com/language/ref/BoundaryDiscretizeRegion.html
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
fun boundaryDiscretizeRegion(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BoundaryDiscretizeRegion", arguments.toMutableList(), options)
}
